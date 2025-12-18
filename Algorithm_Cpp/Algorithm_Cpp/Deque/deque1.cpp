#include <iostream>
#include <string>
#include <deque>

using namespace std;


int deque1() {

        deque<int> dq;
        
        int x;
        cin >> x;
        string s;
        
        for(int i = 0; i < x; i++){
            cin >> s;
            if(s == "push_front"){
                int y;
                cin >> y;
                dq.push_front(y);
            }
            else if(s == "push_back"){
                int y;
                cin >> y;
                dq.push_back(y);
            }
            else if(s == "pop_front"){
                cout << dq.front() << endl;;
                dq.pop_front();
            }
            else if(s == "pop_back"){
                cout << dq.back() << endl;;
                dq.pop_back();
            }
            else if(s == "size"){
                cout << dq.size() << endl;;
            }
            else if(s == "empty"){
                if(dq.empty()){
                    cout << "1" << endl;
                }
                else cout << "0" << endl;;
            }
            else if(s == "front"){
                cout << dq.front() << endl;;
            }
            else if(s == "back"){
                cout << dq.back() << endl;;
            }
        }
    return 0;
}
