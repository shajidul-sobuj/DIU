#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

// ================= STRUCT =================
typedef struct {
    int temp;
    int hum;
    char date[20];
    char time[20];
} Weather;

// ================= QUEUE =================
Weather queue[MAX];
int front = -1, rear = -1;

void enqueue(Weather w) {
    if (rear == MAX - 1) {
        printf("Queue Overflow\n");
        return;
    }
    if (front == -1) front = 0;
    queue[++rear] = w;
}

// ================= TREE =================
typedef struct Node {
    Weather data;
    struct Node *left, *right;
} Node;

Node* createNode(Weather w) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = w;
    newNode->left = newNode->right = NULL;
    return newNode;
}

Node* insertTree(Node* root, Weather w) {
    if (root == NULL)
        return createNode(w);

    if (w.temp < root->data.temp)
        root->left = insertTree(root->left, w);
    else
        root->right = insertTree(root->right, w);

    return root;
}

void inorder(Node* root) {
    if (root == NULL) return;

    inorder(root->left);
    printf("%s | %s | Temp: %d | Hum: %d\n",
           root->data.date,
           root->data.time,
           root->data.temp,
           root->data.hum);
    inorder(root->right);
}

// ================= HEAP =================
Weather heap[MAX];
int heapSize = 0;

void swap(Weather *a, Weather *b) {
    Weather temp = *a;
    *a = *b;
    *b = temp;
}

void heapifyUp(int i) {
    while (i > 0 && heap[(i-1)/2].temp < heap[i].temp) {
        swap(&heap[i], &heap[(i-1)/2]);
        i = (i-1)/2;
    }
}

void insertHeap(Weather w) {
    heap[heapSize] = w;
    heapifyUp(heapSize);
    heapSize++;
}

void showHeap() {
    printf("\n--- Sorted by Temperature (Max Heap) ---\n");
    for (int i = 0; i < heapSize; i++) {
        printf("%s | %s | Temp: %d | Hum: %d\n",
               heap[i].date,
               heap[i].time,
               heap[i].temp,
               heap[i].hum);
    }
}

// ================= INPUT =================
Node* root = NULL;

void inputData() {
    Weather w;

    printf("Date: ");
    scanf("%s", w.date);

    printf("Time: ");
    scanf("%s", w.time);

    printf("Temperature: ");
    scanf("%d", &w.temp);

    printf("Humidity: ");
    scanf("%d", &w.hum);

    enqueue(w);           // Queue
    root = insertTree(root, w); // Tree
    insertHeap(w);        // Heap
}

// ================= DISPLAY =================
void showQueue() {
    if (front == -1) {
        printf("No Data\n");
        return;
    }

    printf("\n--- Queue (Insertion Order) ---\n");
    for (int i = front; i <= rear; i++) {
        printf("%s | %s | Temp: %d | Hum: %d\n",
               queue[i].date,
               queue[i].time,
               queue[i].temp,
               queue[i].hum);
    }
}

// ================= MAIN =================
int main() {
    int choice;

    while (1) {
        printf("\n1. Input Weather Data\n");
        printf("2. Show Data (Queue)\n");
        printf("3. Show Sorted Data (Tree - Inorder)\n");
        printf("4. Show Max Temperature (Heap)\n");
        printf("0. Exit\n");

        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                inputData();
                break;
            case 2:
                showQueue();
                break;
            case 3:
                printf("\n--- Tree (Sorted Ascending Temp) ---\n");
                inorder(root);
                break;
            case 4:
                showHeap();
                break;
            case 0:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
