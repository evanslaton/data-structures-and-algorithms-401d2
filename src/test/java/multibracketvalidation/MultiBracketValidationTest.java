package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("()"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("[]"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("([{}])"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("(())"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("[[]]"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("{{}}"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("no brackets"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue("Should be true", MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation(")([{}]"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("]([{})"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("}([{)]"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("[{}]))"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("({}])]"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("([}])}"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("()[Extra Characters]]"));
        assertFalse("Should be false", MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](()"));

    }
}