var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":125,"methods":[{"el":12,"sc":5,"sl":11},{"el":16,"sc":5,"sl":14},{"el":20,"sc":5,"sl":18},{"el":24,"sc":5,"sl":22},{"el":28,"sc":5,"sl":26}],"name":"Rekord","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":11},{"sl":18},{"sl":22},{"sl":26}],"name":"testBeszur","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27}]},"test_1":{"methods":[{"sl":11},{"sl":14},{"sl":18},{"sl":22},{"sl":26}],"name":"testXML","pass":true,"statements":[{"sl":15},{"sl":19},{"sl":23},{"sl":27}]},"test_3":{"methods":[{"sl":11},{"sl":18},{"sl":22},{"sl":26}],"name":"testBeszur","pass":true,"statements":[{"sl":19},{"sl":23},{"sl":27}]},"test_9":{"methods":[{"sl":11},{"sl":14},{"sl":18},{"sl":22},{"sl":26}],"name":"testXML","pass":true,"statements":[{"sl":15},{"sl":19},{"sl":23},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3, 0, 9, 1], [], [], [9, 1], [9, 1], [], [], [3, 0, 9, 1], [3, 0, 9, 1], [], [], [3, 0, 9, 1], [3, 0, 9, 1], [], [], [3, 0, 9, 1], [3, 0, 9, 1], [], [], [], [], []]
