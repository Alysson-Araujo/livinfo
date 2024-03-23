import UserCase from "../../shared/UserCase";
import UserRepository from "./UserRepository";

type Input = {
  username: string;
  completeName: string;
  email: string;
  password: string;
  dateOfBirth: Date;
};

export default class UserRegister implements UserCase<Input, void> {
  constructor(private readonly userRepository: UserRepository) {}
  async execute(input: Input): Promise<void> {
    const { username, completeName, dateOfBirth, email, password } = input;

    const existsUser = await this.userRepository.findByUsername(email);

    if (existsUser) {
      throw new Error("User already exists");
    }

    await this.userRepository.create({
      username,
      completeName,
      dateOfBirth,
      email,
      password,
    });
  }
}
