#include<stdio.h>
#include<stdlib.h>

# define MAX 100

int stack[MAX];
int top = -1;

int isfull()
{
    return top == MAX-1;
}
int isempty()
{
    return top == -1;
}

void push(int a)
{
    if(isfull())
    {
        return;
    }
    stack[++top] = a;
}
void pop()
{
    if(isempty())
    {
        return;
    }
    top--;
}
int peek()
{
    if(isempty())
    {
        return -1;
    }
    return stack[top];
}
void print()
{
    for(int i = 0; i<=top; i++)
    {
        printf("The %d element is %d\n",i+1,stack[i]);
    }
}
int main()
{
    push(50);
    push(40);
    push(30);
    push(20);
    push(10);
    pop();
    printf("%d\n",peek());
    print();
    return 0;
}