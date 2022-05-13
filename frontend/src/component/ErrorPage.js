const ErrorPage=(props)=>{
    const{error}=props
return (
  

{error} && <div className="alert alert-primary" role="alert">
  {error}
</div>
)
}
export default ErrorPage;