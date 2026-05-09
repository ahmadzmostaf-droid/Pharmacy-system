const validateLogin = require('./app');

test('تاكيد عملية تسجيل الدخول للادمن', () => {
    expect(validateLogin("admin", "123")).toBe(true);
});