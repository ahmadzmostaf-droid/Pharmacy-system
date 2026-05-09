const validateLogin = require('./app');

test('Login validation test for Phase 1', () => {
    expect(validateLogin("admin", "123")).toBe(true);
});