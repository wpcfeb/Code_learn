my_detials = {'name' => 'Peace', 'favcolor' => 'red'}
p my_detials['favcolor']
sample_hash = {'a' => 1, 'b' => 2, 'c' => 3}
p sample_hash
another_hash = {a: 1, b: 2, c: 3}
p another_hash
p another_hash[:a] # :a is Symbol (identifier)

another_hash.each do |key, value|
    puts "The class for key is #{key.class} and the value is #{value.class}"
end

another_hash[:e] = "Peace"
p another_hash
another_hash[:c] = "changed value"
p another_hash

my_hash = {a:1, b: 2, c: 3, d: "Peace"}
my_hash.each{ |some_key, some_value| puts "The key is #{some_key} and the value is #{some_value}"}

p my_hash.select {|k, v| v.is_a?(String)}

my_hash.each { |k, v| my_hash.delete(k) if v.is_a?(String) }
p my_hash

p my_hash.select{ |k, v| v.odd?}