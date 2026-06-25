///MAsum
#include <bits/stdc++.h>
using namespace std;

#define Start ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define int long long
#define endl '\n'
#define pb push_back
#define vi vector<int>
#define vii vector<long long>
#define yes cout << "YES" << endl
#define no cout << "NO" << endl
#define gcd __gcd
#define MOD 1000000007

void solve()
{
    int n , k;
    cin >> n >> k;

    vector <int> v(n);
    for(int i = 0; i < n; ++i) {
        cin >> v[i];
    }

    sort(v.begin() , v.end());
    if(k >= n) {
        int tmp = k - n;
        tmp++;
        int ans = 0;

        for(int i = 0; i < n; ++i) {
            ans += (v[i] * tmp);
            tmp++;
        }
        cout << ans << endl;
    } else {
        int ans = 0;
        for(int i = n - 1; i >= 0; --i) {
            if(k > 0) {
                ans += (v[i] * k);
                k--;
            }
        }
        cout << ans << endl;
    }
}

int32_t main()
{
    Start

    int t = 0;
    cin >> t;

    // solve();

    while (t--)
    {
        solve();
    }

    return 0;
}
