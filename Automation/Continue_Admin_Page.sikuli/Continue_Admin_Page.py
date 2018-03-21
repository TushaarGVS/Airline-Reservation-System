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
wait("1521647949514.png", 60)
click("1521650268945.png")
click("1521650284034.png")
wait("1521651252268.png", 60)
click("1521653802210.png")
try:
    wait("1521647949514.png", 60)
    click("1521650491625.png")
    click("1521650284034-1.png")
    wait("1521651281065.png", 60)
    click("1521653802210.png")
    try:
        wait("1521647949514.png", 60)
        click("1521650629173.png")
        click("1521650284034-2.png")
        wait("1521651307714.png", 60)
        click("1521653802210.png")
        try:
            wait("1521647949514.png", 60)
            
            print "Expected: Continue Works"
            print "Result: Continue Works"
            print "PASS!\n"
            click("1521650387238.png") 
        except:
            print "Expected: Continue Works"
            print "Result: Continue Failed on `Delete Passenger Information` Page"
            print "FAIL!\n"
            click("1521650387238.png") 
    except:
        print "Expected: Continue Works"
        print "Result: Continue Failed on `Flights Information` Page"
        print "FAIL!\n"
        click("1521650387238.png") 
except:
    print "Expected: Continue Works"
    print "Result: Continue Failed on `Passengers Information` Page"
    print "FAIL!\n"
    click("1521650387238.png")