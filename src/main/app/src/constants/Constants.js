const prod = {
    url: {
        USER_API_BASE_URL: 'https://cookie-contacts.lyle.app/api/contacts'}
    };
const dev = {
    url: {
        USER_API_BASE_URL: 'http://localhost:8080/api/contacts'
    }
};
export const config = process.env.NODE_ENV === 'development' ? dev : prod;
