var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":134,"methods":[{"el":11,"sc":5,"sl":8}],"name":"RekordKomparator","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":8}],"name":"testBeszur","pass":true,"statements":[{"sl":10}]},"test_1":{"methods":[{"sl":8}],"name":"testXML","pass":true,"statements":[{"sl":10}]},"test_3":{"methods":[{"sl":8}],"name":"testBeszur","pass":true,"statements":[{"sl":10}]},"test_9":{"methods":[{"sl":8}],"name":"testXML","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [3, 0, 9, 1], [], [3, 0, 9, 1], [], []]
