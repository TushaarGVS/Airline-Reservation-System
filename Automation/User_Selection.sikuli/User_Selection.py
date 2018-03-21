# User Selection: Passenger

click("1521647050515.png")
wait("1521647096029.png", 5*60)
click("1521647134858.png")
wait("1521647197534.png", 60)
click("1521647209367.png")
wait("1521647252411.png", 60)
click("1521647475130.png")
try:
    wait("1521649494361.png", 60)
    print "Expected: Passenger Home"
    print "Result: Passenger Home"
    print "PASS!\n"
    click("1521649558564.png")
except:
    print "Expected: Passenger Home"
    print "Result: Not Passenger Home"
    print "FAIL!\n"
    click("1521649558564.png")

# User Selection: Admin

click("1521647050515-1.png")
wait("1521647096029-1.png", 5*60)
click("1521647134858-1.png")
wait("1521647197534-1.png", 60)
click("1521647209367-1.png")
wait("1521647252411-1.png", 60)
click("1521647286858-1.png")
click("1521647453948-1.png")
click("1521647475130-1.png")
try:
    wait("1521647498230-1.png", 60)
    print "Expected: Admin Login"
    print "Result: Admin Login"
    print "PASS!\n"
    click("1521649040448.png")
except:
    print "Expected: Admin Login"
    print "Result: Not Admin Login"
    print "FAIL!\n"
    click("1521649040448.png") 