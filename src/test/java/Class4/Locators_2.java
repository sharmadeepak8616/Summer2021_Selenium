package Class4;

public class Locators_2 {

    /**
     *
     * Locator : It's a kind of route to reach/find the desired webElement.
     * Datatype of Locator --> By
     *
     * Steps to interact with WebElement:
     * 1. Find the unique address to reach webElement using DOM
     * 2. Depending upon the type of address/info,
     *      we use specific method from By-Class to create locator
     * 3. Use locator to find the WebElement (using findElement() method)
     * 4. when webElement is found, interact with it.
     *
     * Address:
     * 7. xpath
     *         In chropath, create x-path to find the webElement
     *         By locatorUsingXpath = By.xpath("//xpath//to//element")
     *
     *
     */

    /**
     * XPATH
     *
     * Types:
     *  1. Absolute Xpath
     *      a) starts with single slash (/)
     *      b) tells the route of webElement from the root tag (or html tag)
     *      c) not reliable, if any webElement is going to be added/removed in/from the webpage,
     *      the absolute xpath might not work.
     *
     *  2. Relative Xpath
     *      a) starts with double slash (//)
     *      b) reliable bcz we find the webElement using their tag, attributes and/or text
     *
     *     -> simple xpath (direct xpath)
     *     -> advanced xpath (indirect xpath)
     *
     */

    /**
     * Simple xpath (direct xpath)
     *
     * 1. Using attribute:
     *      //tag[@attrName='attrValue']
     *      -> find the tag in dom, where attribute(attrName) has value equals to attrValue
     * eg:
     *      //input[@data-testid='royal_email']
     *      //input[@placeholder='Email or Phone Number']
     *
     * 2. Using text:
     *      //tag[text()='webElement textValue']
     *      -> find the tag in dom, where textValue is equal to webElement textValue
     * eg:
     *      //button[text()='Log In']
     *
     * 3. Using partial attribute-value
     *      //tag[contains(@attrName , 'partial attr val')]
     *      -> find the tag in dom, where attribute(attrName)'s value contains 'partial attr val'
     * eg:
     *      //input[contains(@aria-label, 'Last')]
     *
     * 4. Using partial text-value
     *      //tag[contains(text() , 'partial textVal')]
     *      -> find the tag in dom, where text value contains 'partial textVal'
     * eg:
     *      //div[contains(text(), 'quick')]
     *
     * 5. Using starting portion of attribute-value
     *      //tag[starts-with(@attrName , 'starting attr val')]
     *      -> find the tag in dom, where attribute(attrName)'s value starts-with 'starting attr val'
     * eg:
     *      //input[starts-with(@aria-label , 'Mob')]
     *
     * 6. Using start portion of text-value
     *      //tag[starts-with(text(), 'starting textVal')]
     *      -> find the tag in dom, where text value starts-with 'starting textVal'
     * eg:
     *      //div[starts-with(text(), 'It')]
     *
     * 7. not() method
     *      find the tag where attr/text has value NOT equal to the given value
     *
     * //tag[not(@attrName)]
     * //tag[not(@attrName='value')]
     * //tag[not(text()='value')]
     * //tag[not(contains(@attrName, 'attr value'))
     *
     * 8. and/or operator
     *      //tag[@attr='attrVal' and contains(text(), 'Text Val')]
     *      //tag[contains(text(), 'partial text Val') or starts-with(@attrName, 'Starting Attr Val']
     *
     * eg:
     *      //button[not(@disabled) and contains(@name , 'Eastern Daylight')]
     *
     *
     *
     *  //tag[text()='webElement textValue']
     *  -> find the tag in dom, where textValue is equal to webElement textValue
     *
     *
     *  //*[text()='webElement textValue']
     *  -> find any tag in dom, where textValue is equal to webElement textValue
     *
     *
     *
     *
     */




















}
