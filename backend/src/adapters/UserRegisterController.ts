import { read } from "bun:ffi";
import Elysia from "elysia";
import UserRegister from "../core/user/service/UserRegister";

export default class UserRegisterController {
  constructor(readonly server: Elysia, readonly userCase: UserRegister) {
    server.post("/usuario", async ({ body }) => {
      const { username, completeName, dateOfBirth, email, password } = body as any;
      await userCase.execute({
        username,
        completeName,
        dateOfBirth,
        email,
        password,
      });

      return {
        status: 201,
        body: {
          message: "User created!",
        },
      };
    });
  }
}
