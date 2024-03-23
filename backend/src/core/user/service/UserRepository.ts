import User from "../model/User"

export default interface UserRepository{
    create(input: User): Promise<User>
    findByUsername(username: string): Promise<User | null>
    findByEmail(email: string): Promise<User | null>
}
