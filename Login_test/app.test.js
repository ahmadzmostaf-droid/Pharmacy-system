const validateLogin = require('./app');

test('Login succeeds with correct credentials', () => {
    expect(validateLogin("admin", "123")).toBe(true);
});

test('Login fails with incorrect credentials', () => {
    expect(validateLogin("wrongUser", "wrongPass")).toBe(false);
});