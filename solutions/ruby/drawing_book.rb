def drawing_book n, p
	if n % 2 == 0
		range = if(n / 2 >= p)
			[0, p]
		else
			[p, n]
		end
	else
		range = if(n / 2.to_f > p)
			[1, p]
		else
			[p, n - 1]
		end
	end

	diff = range[1] - range[0]

	result = if(range[0] == 0)
		(diff/2.to_f).floor
	else
		(diff/2.to_f).ceil
	end
	
	result
end