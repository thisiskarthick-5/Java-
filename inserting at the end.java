#include <stdio.h>
#include <stdlib.h>

int main(){
  
  struct node{
    int data ;
    struct node* next ;
    
  };
  
  struct node* head = (struct node*)malloc(sizeof(struct node));
  head -> data = 90;
  head -> next = NULL;
  
  struct node* newnode = (struct node*)malloc(sizeof(struct node));
  newnode -> data = 78;
  newnode -> next = NULL;
  
  
  struct node* newnode1 = (struct node*)malloc(sizeof(struct node));
  newnode1 -> data = 67;
  newnode1 -> next = NULL;
  
  head -> next = newnode;
  newnode -> next = newnode1;
  
  struct node* temp = head;
  while(temp != 0){
    printf("%d " , temp -> data);
    temp = temp -> next;
    
  }
  
  return 0;
}
