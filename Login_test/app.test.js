const validateLogin = require('./app');

test('Validation: Should return true for correct credentials', () => {
    expect(validateLogin("admin", "123")).toBe(true);
});

test('Validation: Should return false for wrong credentials', () => {
    expect(validateLogin("wrongUser", "wrongPass")).toBe(false);
});