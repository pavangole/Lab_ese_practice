#include<iostream>
#include<queue>
#include<stack>
using namespace std;


int prec(char c)
{
    if (c == '^')
        return 3;
    else if (c == '/' || c == '*')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return -1;
}

string infixtoPrefix(string s)
{
    stack<char> st;
    string result ="";
    for (int i = 0; i < s.length() - 2; i++)
    {   
        char c = s[i];
        if( c >= 'a' && c <= 'z') {
            result+= c;
            cout << 1 << endl;
        }
        else if(c == '(') {
            st.push('(');
            cout << 2 << endl;
        }
        else if(c == ')') {
            cout << 3 << endl;
            while(st.top() != ')') {
                cout << st.top() << endl;
                result+=st.top();
                cout << result << endl;
                st.pop();
                
            }
            st.pop();
        }
        else {

            while(!st.empty() && prec(c) <= prec(st.top())) {
                result += st.top();
                st.pop();
            }
            st.push(c);
        }
    }
    while (!st.empty())
    {

        result += st.top();
        st.pop();
    }
    return result;
    
    
}


int main()
{
    string exp = "a+b*(c^d-e)^(f+g*h)-i";
 
    // Function call
    infixtoPrefix(exp);
    return 0;
}