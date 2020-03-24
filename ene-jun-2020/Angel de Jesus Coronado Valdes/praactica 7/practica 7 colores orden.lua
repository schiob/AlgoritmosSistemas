function Shell( a )
    local inc = math.ceil( #a / 2 )
    while inc > 0 do
        for i = inc, #a do
            local tmp = a[i]
            local j = i
            while j > inc and a[j-inc] > tmp do
                a[j] = a[j-inc]
                j = j - inc
            end
            a[j] = tmp
        end
        inc = math.floor( 0.5 + inc / 2.2 )
    end 
 
    return a
end

-----------------------------------------------------------------------------------------


print("cantidad de colores y su serie: ")
num = io.read("*n")
s= io.read()

local ss = {}

for w in s:gmatch("%S+") do 
	table.insert(ss, tonumber(w))
end
print(" ")
if num == #ss then
	arr = Shell(ss)

for i=1,#ss do
	io.write(ss[i]," ")
end
end



