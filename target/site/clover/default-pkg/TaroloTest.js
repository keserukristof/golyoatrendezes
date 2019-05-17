var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":234,"methods":[{"el":14,"sc":5,"sl":7},{"el":22,"sc":5,"sl":16},{"el":34,"sc":5,"sl":24}],"name":"TaroloTest","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":24}],"name":"testNyert","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_4":{"methods":[{"sl":7}],"name":"testKiemel","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12},{"sl":13}]},"test_5":{"methods":[{"sl":16}],"name":"testBerak","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21}]},"test_6":{"methods":[{"sl":7}],"name":"testKiemel","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12},{"sl":13}]},"test_7":{"methods":[{"sl":24}],"name":"testNyert","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_8":{"methods":[{"sl":16}],"name":"testBerak","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [4, 6], [], [4, 6], [4, 6], [4, 6], [4, 6], [4, 6], [], [], [8, 5], [], [8, 5], [8, 5], [8, 5], [8, 5], [], [], [7, 2], [], [7, 2], [7, 2], [7, 2], [7, 2], [7, 2], [7, 2], [7, 2], [7, 2], [], []]
