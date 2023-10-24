#include <iostream>
#include <algorithm>
#include <vector>
#include <map>

using namespace std;

int main() {
    vector<int> my_vec;
    int n;
    cout << "Enter the n value: ";
    cin >> n;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        my_vec.push_back(x);
    }

    map<int, int> mp;  

    for (int i = 0; i < n; i++) {
        mp[my_vec[i]]++;
    }

    for (auto it = mp.begin(); it != mp.end(); it++) {
        cout << it->first << "\t" << it->second << endl;
    }

    return 0;
}

