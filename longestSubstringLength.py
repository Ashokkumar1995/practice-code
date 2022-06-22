s = 'abba'

mp = {}

l = 0
ans = 0
for r in range(len(s)):
    if s[r] in mp:
        l = max(l, mp[s[r]])
        print("Iff", l)

    ans = max(ans, r-l+1)
    mp[s[r]] = r+1

    print(mp)
    print(ans)
