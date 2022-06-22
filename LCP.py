def lcpArray(str):
    s = []

    for i in range(len(str)):
        s.append(str[i:len(str)])

    s.sort()
    print(*s, sep="\n")

    result = []
    for j in range(len(s)-1):
        res = matching(s[j], s[j+1])
        result.append(res)
    print(result)


def matching(s1, s2):
    print("----", s1, s2, "\n")
    c = 0
    if len(s1) > len(s2):
        for i in range(len(s2)):
            if s1[i] != s2[i]:
                break
            if s1[i] == s2[i]:
                c += 1
    else:
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                break

            if s2[i] == s1[i]:
                c += 1
    print(c)
    return c


lcpArray('dbddadadadadccbc$')

#  'daabddabddabcabc$'
