#include <stdio.h>
int main(){
  
  struct node{
    int data;
    struct node* next;
  };
  
  
  struct node* head;
  struct node* second;
  struct node* third;
  
  head = (struct node*)malloc(sizeof(struct node));
  second = (struct node*)malloc(sizeof(struct node));
  third = (struct node*)malloc(sizeof(struct node));
  
  head -> data = 10;
  head -> next = second;
  
  second -> data = 40;
  second -> next = third;
  
  third -> data = 60;
  third -> next = NULL;
  
  
  struct node* temp = head;
  while(temp != 0){
    printf("%d " , temp -> data );
    temp = temp -> next;
    
  }
  return 0;
  
  
  
  
  
  
  
  
  
  
}
