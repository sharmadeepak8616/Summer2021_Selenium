package Class3;

public class WebElements_DOM_2 {

    /**
     * Types of WebElements:
     *      Text Box/Input Box -> type/clear
     *      Buttons -> click
     *      Radio Buttons -> click
     *      CheckBox -> click
     *      Dropdown -> click
     *      hyperlink (link) -> click
     *          text associated with a link, is called linkText
     *      Image -> click
     *      Alert
     *      Frames
     *
     */

    /**
     * DOM - Document Object Model
     *
     * code -> generates DOM -> Dom creates the website
     *
     * <tag1>   --> starting of tag1    (tag names cannot have spaces)
     *
     * </tag1>  --> closing of tag1
     *
     * <tag1 attr1="value1" attr2="value2" attr3 attr4="value of attr4"></tag1>
     *      attr1, attr2, attr3, attr4 --> attributes of tag1 (attributes names cannot have spaces)
     *      each attribute may or may not have a value
     *
     * <tag1 attr1="value1" attr3 attr4="value of attr4">text value</tag1>
     *      tag1 has text value = "text value"
     *
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="val21" attr22="val22">
     *         text value
     *     </tag2>
     *     <tag3>
     *         text value again
     *     </tag3>
     *      text data
     * </tag1>
     *
     * text with tag2 --> text value
     * text with tag3 --> text value again
     * text with tag1 --> text data
     *
     * tag1 is parent of tag2 and tag3 [ tag2 and tag3 are children of tag1 ]
     * tag2 and tag3 are siblings
     *
     *
     * <tag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *     <tag2 id="abcd" data-text-id="unique data" attr3="value3" attr4="value4">
     *         <tag3>Not Unique Text
     *              <subTag attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag>
     *         </tag3>
     *         <tag11 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag11>
     *         <tag21 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag21>
     *     </tag2>
     *     <tag4 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *         <a attr1="value1" attr2="value2">Unique Text</tag>
     *     </tag4>
     *     <tag6 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *          <tag7 attr1="value1" attr2="value2" attr3="value3" attr4="value4"></tag>
     *     </tag6>
     * </tag1>
     *
     *
     * children of tag1 --> tag2, tag4 and tag6
     *
     * parent of subTag --> tag3
     *
     * siblings of subTag --> 0
     *
     * siblings of tag11 --> tag3 and tag21
     *
     * following-sibling (sibling-tags appearing in dom after the tag)
     * following-sibling of tag3 --> 2 (tag11 and tag21)
     *
     * preceding-sibling (sibling-tags appearing in dom before the tag)
     * preceding-sibling for tag11 --> 1 (tag3)
     *
     * following (tags appearing in dom after the tag)
     * following of tag2 --> tag3, subTag, tag11, tag21, tag4, a, tag6, tag7
     *
     * descendant (tags in the family chain appearing in dom after the tag)
     * descendant of tag2 --> tag3, subTag, tag11, tag21
     *
     * preceding (tags appearing in dom before the tag)
     * preceding of a --> tag4, tag21, tag11, subTag, tag3, tag2, tag1
     *
     * ancestor (tags in the family chain appearing in dom before the tag)
     * ancestor of a --> tag4, tag1
     *
     */




}
