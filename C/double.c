#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
    struct node* prev;
};
struct node* head = NULL;
struct node* createnode(int x)
{
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = x;
    newnode->next = NULL;
    newnode->prev = NULL;
    return newnode;
}
void insert(int a)
{
    struct node* new_node = createnode(a);
    if(head != NULL)
    {
        head->prev = new_node;
    }
    new_node->next = head;
    head = new_node;
    
}
void insert_at_position(int b,int pos)
{
    if(head == NULL)
    {
        printf("Linked list is empty");
    }
    struct node* temp = head;
    struct node* new_node = createnode(b);

    if(pos == 1)
    {   
        new_node->next =  head;
        head =  new_node;
        return;
    }
        if(temp == NULL)
        {
            return;
        }
        for(int i = 1;i < pos-1 && temp!=NULL;i++)
        {
            temp = temp->next;
        }
        new_node->next = temp->next;
        new_node->prev = temp;
        temp->next->prev = new_node;
        temp->next = new_node;
}
void delete(int pos)
{
    if(head == NULL)
    {
        printf("Linked list is empty");
    }
    struct node*temp = head;
    if(pos == 1)
    {
        head = head->next;
        head->prev = NULL;
        free(temp);
        return;
    }
        for(int i = 1;i < pos && temp != NULL;i++)
        {
            temp = temp->next;
        }
        
        if(temp == NULL)
        {
            return;
        }
        if(temp->next == NULL)
        {
            temp->prev->next = NULL;
            free(temp);
            return;
        }
        temp->next->prev = temp->prev;
        temp->prev->next = temp->next;
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

int main()
{
    insert(40);
    insert(30);
    insert(20);
    insert(10);
    insert_at_position(200,2);
    delete(3);
    print();
    return 0;
}