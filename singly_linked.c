#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *createnode(int a)
{
    struct node* newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = a;
    newnode->next = NULL;
    return newnode;
}

struct node *insert(struct node *head,int a)
{
    struct node *new_node = createnode(a);

    if (head == NULL) {
        return new_node;
    }
    
    new_node -> next = head->next;
    head->next = new_node
    return head;
}

struct node *insert_at_specific(struct node* head, int a, int position)
{
    struct node *new_nod = createnode(a);
    if(position == 0)
    {
        new_nod ->next = head;
        return new_nod;
    }
    struct node *temp = head;
    for(int  i = 0;temp != NULL && i < position - 1;i++)
    {
        temp = temp -> next;
    }

    if(temp == NULL)
    {
        printf("Invalid Position\n");
        return head;
    }

        new_nod->next = temp->next;
        temp->next = new_nod;

    return head;
}
struct node* delete_at_specific(struct node* head, int position)
{
    struct node*prev = NULL;
    struct node* temp = head;
    if(head == NULL)
    {
        return NULL;
    }
    if(position == 0)
    {
        head = head->next;
        free(temp);
        return head;
    }
    for(int i = 0;temp != NULL && i < position;i++)
    {
        prev = temp;
        temp = temp->next;
    }
    prev->next = temp-> next;
    free(temp);
    return head;
}

void print(struct node* head)
{
    struct node* p = head;
    while(p != 0)
    {
        printf("%i\n",p->data);
        p = p -> next;
    }
}
int main()
{
    struct node*head = createnode(10);
    head = insert(head,20);
    head = insert(head,30);
    head = insert_at_specific(head,200,2);
    head = delete_at_specific(head,0);
    print(head);
}