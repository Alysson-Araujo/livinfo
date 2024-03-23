export default interface UserCase<I, O>{
    execute(input:I): Promise<O>
}