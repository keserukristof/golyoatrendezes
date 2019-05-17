var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":55,"methods":[{"el":14,"sc":5,"sl":12},{"el":22,"sc":5,"sl":20},{"el":30,"sc":5,"sl":28}],"name":"Labda","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":12},{"sl":28}],"name":"testNyert","pass":true,"statements":[{"sl":13},{"sl":29}]},"test_4":{"methods":[{"sl":12}],"name":"testKiemel","pass":true,"statements":[{"sl":13}]},"test_5":{"methods":[{"sl":12}],"name":"testBerak","pass":true,"statements":[{"sl":13}]},"test_6":{"methods":[{"sl":12}],"name":"testKiemel","pass":true,"statements":[{"sl":13}]},"test_7":{"methods":[{"sl":12},{"sl":28}],"name":"testNyert","pass":true,"statements":[{"sl":13},{"sl":29}]},"test_8":{"methods":[{"sl":12}],"name":"testBerak","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [8, 5, 7, 2, 4, 6], [8, 5, 7, 2, 4, 6], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7, 2], [7, 2], [], []]
