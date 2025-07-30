#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

int main() {
    struct Node* head = NULL;
    struct Node* newNode, *temp;
    int i;

    // Creating first 3 nodes: 10 -> 20 -> 30
    head = (struct Node*)malloc(sizeof(struct Node));
    head->data = 10;
    head->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->data = 20;
    head->next->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->next->data = 30;
    head->next->next->next = NULL;

    // Let's insert 15 at position 2 (between 10 and 20)
    int pos = 2;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = 15;

    temp = head;
    for (i = 1; i < pos - 1; i++) {
        temp = temp->next;
    }

    newNode->next = temp->next;
    temp->next = newNode;

    // Print the list: should be 10 -> 15 -> 20 -> 30
    temp = head;
    printf("List after inserting at position %d:\n", pos);
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    return 0;
}
