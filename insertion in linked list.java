#include<stdio.h>
#include<stdlib.h>
int main(){
  
  struct node{
    int data;
    struct node* next;
    
  };
  
  struct node* head = (struct node*)malloc(sizeof(struct node));
  head -> data = 67;
  head -> next = NULL;
  
  struct node* newnode = (struct node*)malloc(sizeof(struct node));
  newnode -> data  = 90;
  
  newnode -> next = head;
  head = newnode;

 struct node* newnode1 = (struct node*)malloc(sizeof(struct node));
  newnode1 -> data  = 902;
  
  newnode1 -> next = head;
  head = newnode1;
  
  
  struct node* temp = head;
  while(temp != NULL){
    printf("%d " , temp -> data);
    temp = temp -> next;
  }
}
