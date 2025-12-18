#include <iostream>
#include <stack>
#include <string>

using namespace std;

int stack2() {

    string str;
    stack <int> s;
    cin >> str;
    int k = 1;
    for(int i = 0; i < str.size(); i++){
        if(str[i] == '('){
            s.push(1);
        }
        else if(str[i] == ')'){
            if(s.empty()){
                k = 2;
                break;
            }else s.pop();
        }
    }
    if(s.empty() && k == 1){
            cout << "Yes" << endl;
    }
    else cout << "No" << endl;

    return 0;
}
