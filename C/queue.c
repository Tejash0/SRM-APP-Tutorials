#include<stdio.h>
#include<stdlib.h>

# define MAX 100

int queue[MAX];
int front = -1,rear = -1;

int isfull()
{
    return front == MAX-1;
}
int isempty()
{
    return  rear == -1;
}

void enqueue(int a)
{
    if(isfull())
    {
        return;
    }
    front = 0;
    queue[++rear] = a;
}
void dequeue()
{
    if(isempty())
    {
        return;
    }
    front++;
}
int peek()
{
    if(isempty())
    {
        return -1;
    }
    return queue[front];
}
void print()
{
    for(int i = front; i<=rear; i++)
    {
        printf("The %d element is %d\n",i+1,queue[i]);
    }
}
int main()
{
    enqueue(50);
    enqueue(40);
    enqueue(30);
    enqueue(20);
    enqueue(10);
    dequeue();
    printf("%d\n",peek());
    print();
    return 0;
}