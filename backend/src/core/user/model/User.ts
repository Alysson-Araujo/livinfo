export default interface User{
    id?: string,
    username: string,
    completeName: string,
    email: string,
    password: string,
    dateOfBirth: Date,
    createdAt?: Date,
    updatedAt?: Date,
}