#include<stdio.h>
#include<conio.h>
#define N 5
int queue[N];
int front=-1;
int rear=-1;
void enqueue(int data){
if(rear>N-1){
    printf("overflow");
}
else if(front==-1 && rear==-1){
    front=rear=0;
    queue[rear]=data;
}
else{
    rear++;
    queue[rear]=data;
}
}
void dequeue(){
if(front<0 || front>rear){
    printf("underflow");
}
else if(front==rear){
    front=rear=-1;
}
else{
    front++;
}
}
void dis(){
if(front<0 || front>rear){
    printf("underflow");
}
else{
     int i;
     for(i=front;i<=rear;i++){
        printf("%d \n",queue[i]);
     }
    }
}
void peek(){
if(front<0 || front>rear){
    printf("underflow");

}
else{
    printf("%d",queue[front]);
}
}
int main(){
enqueue(5);
enqueue(6);
dis();
dequeue();

dis();
return 0;

}
