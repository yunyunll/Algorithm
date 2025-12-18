#include <iostream>
#include <string>
#include <stack>

using namespace std;

int stack1() {

    int k;
    cin >> k;
    stack<int> s;
    string str;

    for(int i = 0; i < k; i++){
        cin >> str;
        if(str == "push"){
            int n;
            cin >> n;
            s.push(n);
        }
        else if(str == "pop"){
            cout << s.top() << endl;
            s.pop();
        }
        else if(str == "size"){
            cout << s.size() << endl;
        }
        else if(str == "empty"){
            cout << s.empty() << endl;
        }
        else if(str == "top"){
            cout << s.top() << endl;
            
        }
    }

    return 0;
}
