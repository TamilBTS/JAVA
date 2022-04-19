#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
int data;
struct node* next;
};
typedef struct node Node;

Node* head=NULL;
void insert(int val,int pos){
    Node* newNode=(struct Node*)malloc(sizeof(Node));

    if(head==NULL && pos>1){
        printf("invalid...enter pos:1");
        return;
    }
    if(pos<1){
        printf("invalid position");
        return;
    }
    newNode->data=val;
    if(pos==1){
        if(head==NULL){
            head=newNode;
            head->next=NULL;
        }
        else{
            newNode->next=head;
            head=newNode;
        }
        return;
    }
    Node* temp=head;
    int i=2;
    for(i=2;i<pos;i++){
        temp=temp->next;
        if(temp==NULL){
            printf("invalid position");
            return;
        }

    }
    newNode->next=temp->next;
    temp->next=newNode;

}


void traverse(){

if(head==NULL){
    printf("no values in list");
    return;
  }
  Node* temp=head;

    printf("linked list elements are\n");
    while(temp!=NULL){
    printf("%d \n",temp->data);
    temp=temp->next;}return;

}
void del(int pos){
if(head==NULL){
    printf("invalid no elements to delete");
    return;
}
Node* temp=head;
Node* pre;
if(pos==1){
    int val=head->data;
    head=head->next;
    return;
}
int i=2;
for( i=2;i<=pos;i++){
        pre=temp;
temp=temp->next;
    if(temp==NULL){
        printf("invalid");
        return;
    }
    pre->next=temp->next;
    free(temp);
}
}

int main(){
    int pos,n,val;
while(1){

    printf("\n enter your choice:");
    scanf("%d",&n);

    switch(n){
case 1:
    printf("enter value and position");
    scanf("%d",&val);
    scanf("%d",&pos);

    insert(val,pos);
    break;
case 2:
    traverse();
    break;
case 3:
    printf("enter position to delete");
    scanf("%d",&pos);
    del(pos);
    break;
case 4:
    exit(0);
    }
    }
    return 0;
}

