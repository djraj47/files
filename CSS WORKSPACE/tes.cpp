#include<iostream>
using namespace std;
int main(){
    int num;
    int count++;
    cin>>num;
    while(num>0)
    {
        num=num/10;
        count++    }
        cout<<"The no of digit is" <<count;
        return 0; 
}