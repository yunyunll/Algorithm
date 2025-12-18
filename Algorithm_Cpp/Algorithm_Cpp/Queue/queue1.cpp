#include <iostream>
#include <string>
#include <queue>

using namespace std;

int queue1() {

    int k;
    cin >> k;
    queue<int> q;
    string str;

    for(int i = 0; i < k; i++){
        cin >> str;
        if(str == "push"){
            int n;
            cin >> n;
            q.push(n);
        }
        else if(str == "pop"){
            cout << q.front() << endl;
            q.pop();
        }
        else if(str == "size"){
            cout << q.size() << endl;
        }
        else if(str == "empty"){
            if(q.empty()){
                cout << "1" << endl;
            }else cout << "0" << endl;
           
        }
        else if(str == "front"){
            cout << q.front() << endl;
            
        }
    }

    return 0;
}
