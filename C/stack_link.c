#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
};
struct node* head = NULL;

int isempty()
{
    return head == NULL;
}
struct node* createnode(int x)
{
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = x;
    newnode->next = NULL;
    return newnode;
}

void push(int x)
{
    struct node* new_node = createnode(x);
    new_node->next = head;
    head = new_node;
    
}
void pop()
{
    if(isempty())
    {
        printf("Stack is empty");
    }
    struct node*temp = head;
    head = head->next;
    free(temp);
}
void print()
{
    struct node* temp = head;
    while(temp != NULL)
    {
        printf("The data is: %d\n",temp->data);
        temp = temp->next;
    }
    free(temp);
}
void peek()
{
    if(isempty())
    {
        return;
    }
    printf("The top element is:%d\n",head->data);
}

int main()
{
    push(50);
    push(40);
    push(30);
    push(20);
    push(10);
    pop();
    peek();
    print();
    return 0;
}