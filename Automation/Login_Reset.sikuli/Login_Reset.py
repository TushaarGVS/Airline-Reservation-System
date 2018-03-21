# Both Username and Password are entered

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
click("1521649784990.png")
try: 
    wait("1521649082639.png", 60)
    print "Expected: Reset Username and Password Fields" 
    print "Result: Reset Username and Password Fields"
    print "PASS!\n"
    click("1521648169834.png")    
except:
    print "Expected: Reset Username and Password Fields" 
    print "Result: Didn't Reset Username and Password Fields"
    print "FAIL!\n"
    click("1521648169834.png")

# Only Username is entered

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
click("1521649784990.png")
try: 
    wait("1521649082639.png", 60)
    print "Expected: Reset Username Field" 
    print "Result: Reset Username Field"
    print "PASS!\n"
    click("1521648169834.png")    
except:
    print "Expected: Reset Username Field" 
    print "Result: Didn't Reset Username Field"
    print "FAIL!\n"
    click("1521648169834.png")

# Only Password is entered

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
type("1521647586573.png", "palsucks")
click("1521649784990.png")
try: 
    wait("1521649082639.png", 60)
    print "Expected: Reset Password Field" 
    print "Result: Reset Password Field"
    print "PASS!\n"
    click("1521648169834.png")    
except:
    print "Expected: Reset Password Field" 
    print "Result: Didn't Reset Password Field"
    print "FAIL!\n"
    click("1521648169834.png")

# Both Username and Password are not entered

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
click("1521649784990.png")
try: 
    wait("1521649082639.png", 60)
    print "Expected: Reset Nothing" 
    print "Result: Reset Nothing"
    print "PASS!\n"
    click("1521648169834.png")    
except:
    print "Expected: Reset Nothing" 
    print "Result: Didn't Reset"
    print "FAIL!\n"
    click("1521648169834.png")