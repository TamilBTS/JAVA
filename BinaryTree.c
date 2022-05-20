#include<stdio.h>
#include<conio.h>
struct node{
int data;
struct node* left;
struct node* right;
};

struct node* insert(){
    int x;
    struct node* NewNode=(struct node*)malloc(sizeof(struct node));
    printf(" \n enter the value(-1 for null)");
    scanf("%d",&x);
    if(x==-1){
        return 0;
    }
    NewNode->data=x;
    printf("enter left child of %d",x);
    NewNode->left=insert();
    printf("enter right child of %d",x);
    NewNode->right=insert();
    return NewNode;
}
void InOrder(struct node* root){
if(root==0){
    return;
}
InOrder(root->left);
printf("\n %d",root->data);
InOrder(root->right);

}
void PreOrder(struct node* root){
if(root==0){
    return;
}
printf("\n %d",root->data);
PreOrder(root->left);
PreOrder(root->right);
}
void PostOrder(struct node* root){
if(root==0){
    return;
}
PostOrder(root->left);
PostOrder(root->right);
printf("\n %d",root->data);
}
int main(){
struct node* root;
root=0;
root=insert();
InOrder(root);
PreOrder(root);
PostOrder(root);
}
