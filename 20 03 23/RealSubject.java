class RealSubject extends Subject {
    Dictionary<string, string> dictionary;

    public RealSubject() {
        dictionary = new Dictionary<string, string>();
        dictionary.Add("TestKey", "TestValue");
    }

    public void Create(string key, string value) {
        this.dictionary.Add(key, value);
    }

    public string Reade(string key) {
        return this.dictionary[key];
    }

    public bool Update(string key, string value) {
        if (this.dictionary.ContainsKey(key) && this.dictionary.ContainsVakue(value)) {
            this.dictionary[key] = value;
            return true;
        }
        else {
            return false;
        }
    }

    public bool Delete(string key) {
        return this.dictionary.Remove(key);
    }
    
}