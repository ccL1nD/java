abstract class Subject {
    public abstract void Create(string key, string value);
    public abstract string Reade(string key);
    public abstract bool Update(string key, string value);
    public abstract bool Delete(string key);
}