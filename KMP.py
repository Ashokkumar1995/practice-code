def main():
    s = 'bccaabccaabaaaa'
    n = len(s)
    print(n)
    pi = [0 for i in range(n)]
    i = 1
    j = 0
    while i < n:
        if(s[i] == s[j]):
            pi[i] = j+1
            i += 1
            j += 1
        elif j != 0:
            j = pi[j-1]
        else:
            pi[i] = 0
            i += 1
    print(pi, len(pi))


main()
