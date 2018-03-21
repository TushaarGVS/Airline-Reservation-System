# Login Pass - Case 1

click("1521647050515.png")
wait("1521647096029.png", 5*60)
click("1521647134858.png")
wait("1521647197534.png", 60)
click("1521647209367.png")
wait("1521647252411.png", 60)
click("1521647286858.png")
click("1521647453948.png")
click("1521647475130.png")
wait("1521647498230.png", 60)
type("1521647572455.png", "tushaar")
type("1521647586573.png", "palsucks")
click("1521647911193.png")
try: 
    wait("1521647949514.png", 60)
    print "Expected: Login Passed" 
    print "Result: Login Passed"
    print "PASS!\n"
    click("1521648169834.png")    
except:
    print "Expected: Login Passed" 
    print "Result: Login Failed"
    print "FAIL!\n"
    click("1521648236132.png")
    wait("1521649082639.png", 60)
    click("1521649040448.png")

# Login Failed - Case 2

click("1521647050515.png")
wait("1521647096029.png", 5*60)
click("1521647134858.png")
wait("1521647197534.png", 60)
click("1521647209367.png")
wait("1521647252411.png", 60)
click("1521647286858.png")
click("1521647453948.png")
click("1521647475130.png")
wait("1521647498230.png", 60)
type("1521647572455.png", "himadri")
type("1521647586573.png", "palsucks")
click("1521647911193.png")
try: 
    wait("1521647949514.png", 60)
    print "Expected: Login Failed" 
    print "Result: Login Passed"
    print "FAIL!\n"
    click("1521648169834.png")    
except:
    print "Expected: Login Failed" 
    print "Result: Login Failed"
    print "PASS!\n"
    click("1521648236132.png")
    wait("1521649082639.png", 60)
    click("1521649040448.png")

# Login Failed - Case 3

click("1521647050515.png")
wait("1521647096029.png", 5*60)
click("1521647134858.png")
wait("1521647197534.png", 60)
click("1521647209367.png")
wait("1521647252411.png", 60)
click("1521647286858.png")
click("1521647453948.png")
click("1521647475130.png")
wait("1521647498230.png", 60)
type("1521647572455.png", "tushaar")
type("1521647586573.png", "sucks")
click("1521647911193.png")
try: 
    wait("1521647949514.png", 60)
    print "Expected: Login Failed" 
    print "Result: Login Passed"
    print "FAIL!\n"
    click("1521648169834.png")    
except:
    print "Expected: Login Failed" 
    print "Result: Login Failed"
    print "PASS!\n"
    click("1521648236132.png")
    wait("1521649082639.png", 60)
    click("1521649040448.png")

# Login Failed - Case 4

click("1521647050515.png")
wait("1521647096029.png", 5*60)
click("1521647134858.png")
wait("1521647197534.png", 60)
click("1521647209367.png")
wait("1521647252411.png", 60)
click("1521647286858.png")
click("1521647453948.png")
click("1521647475130.png")
wait("1521647498230.png", 60)
type("1521647572455.png", "pal")
type("1521647586573.png", "sucks")
click("1521647911193.png")
try: 
    wait("1521647949514.png", 60)
    print "Expected: Login Failed" 
    print "Result: Login Passed"
    print "FAIL!\n"
    click("1521648169834.png")    
except:
    print "Expected: Login Failed" 
    print "Result: Login Failed"
    print "PASS!\n"
    click("1521648236132.png")
    wait("1521649082639.png", 60)
    click("1521649040448.png")