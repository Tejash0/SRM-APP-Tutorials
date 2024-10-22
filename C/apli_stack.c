#include<stdio.h>
#include<stdlib.h>
#include<string.h>

# define MAX 100

char stack[MAX];
int top = -1;

int isfull()
{
    return top == MAX-1;
}
int isempty()
{
    return top == -1;
}

void push(char a)
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
    for(int i = top; i >= 0; i--)
    {
        printf("%c",stack[i]);
    }
}
int main()
{
    char str[MAX];
    printf("Enter a string: ");
    gets(str);
    for(int i = 0;i < strlen(str);i++)
    {
        push(str[i]);
    }
    printf("Original String: %s\n",str);
    printf("Reversed String: ");
    print();
}