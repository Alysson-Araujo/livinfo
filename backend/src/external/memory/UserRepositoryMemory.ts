import User from "../../core/user/model/User";
import UserRepository from "../../core/user/service/UserRepository";

export default class UserRepositoryMemory implements UserRepository{
    constructor(private readonly users: User[] = []) {}

    async findByEmail(email: string): Promise<User | undefined> {
        return this.users.find((user) => user.username === username);
    }

    async create(user: User): Promise<void> {
        this.users.push(user);
    }


}