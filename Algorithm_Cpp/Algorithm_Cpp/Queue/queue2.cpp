#include <iostream>
#include <queue>

using namespace std;

int queue2() {

    int k,n;
    cin >> k >> n;
    queue<int> q;

    for(int i = 0; i < k; i++){
        q.push(i + 1);
    }
    
    for(int i = 0; i < k; i++){
        for(int j = 0; j < n-1; j++){
            q.push(q.front());
            q.pop();
        }
        cout << q.front() << " ";
        q.pop();
    }




    return 0;
}
